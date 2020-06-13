<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/"><html lang="de-DE">
    <head>
    <meta charset="UTF-8"/>
    <meta http-equiv="x-ua-compatible" content="ie=edge"/>
    <meta name="author" content="Wojciech Jagodziński 426145" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700" rel="stylesheet"/>
    <title>Zadanie 2</title>
        <style>
            *, *::before, *::after {
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
                font-family: 'Montserrat';
            }
            .container{
                max-width: 1700px;
                margin-left: auto;
                margin-right: auto;
                box-shadow: 0 1px 2px rgba(0,0,0,0.07), 0 2px 4px rgba(0,0,0,0.07), 0 4px 8px rgba(0,0,0,0.07), 0 8px 16px rgba(0,0,0,0.07), 0 16px 32px rgba(0,0,0,0.07), 0 32px 64px rgba(0,0,0,0.07);
                box-sizing: border-box;
                padding: 1rem 2rem;
                display: flex;
                flex-wrap: wrap;
                margin-top: 3rem;
                border-radius: 25px;
            }
            h1,h2,h3{
            font-weight: 700;
            width:100%;
            }
            .poem{
                width: 48%;
                padding: 1rem;
                margin: 1%;
                max-height: 400px;
                overflow: auto;
                border: solid 1px #e4e0e0;
                border-radius: 15px 0px 0px 15px;
                display: flex;
                flex-direction: row;
                flex-wrap: wrap;
            }
            .verse{
                white-space: nowrap;
                font-size: 1rem;
                width: 100%;
            }
            .strophe{
                display: flex;
                flex-wrap: wrap;
                margin-bottom: 1rem;
            }
            ::-webkit-scrollbar {
              width: 3px;
            }
            ::-webkit-scrollbar-track {
              box-shadow: inset 0 0 5px grey;
              border-radius: 10px;
            }
            ::-webkit-scrollbar-thumb {
              background: #e4e0e0;
              border-radius: 10px;
            }
            .bold{
                font-weight: 700
            }
        </style>
    </head>
	<body>

        <div class="container">
            <h1>Zbiór wierszy</h1>
            <xsl:apply-templates/>
        </div>
    </body>
	</html></xsl:template>
	<xsl:template match="Poem">
		<div class="poem"><xsl:apply-templates/></div>
	</xsl:template>
	<xsl:template match="Author">
		<h4><br></br><br></br><xsl:value-of select="FirstName"/> <xsl:value-of select="LastName"/></h4>
	</xsl:template>
	<xsl:template match="Title">
		<h2><xsl:apply-templates/></h2>
	</xsl:template>
	<xsl:template match="Subtitle">
		<h3><xsl:apply-templates/></h3>
	</xsl:template>
	<xsl:template match="Strophe">
		<div class="strophe"><xsl:apply-templates/></div>
	</xsl:template>
    <xsl:template match="Verse">
        <span class="verse"><xsl:apply-templates/></span>
    </xsl:template>
	<xsl:template match="Bold">
		<span class="bold"><xsl:value-of select="."/></span>
    </xsl:template>
</xsl:stylesheet>

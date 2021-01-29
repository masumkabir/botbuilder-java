// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// ------------------------------------------------------------------------------

package com.microsoft.recognizers.text.numberwithunit.resources;

public class BaseUnits {

    public static final String HourRegex = "(?<hour>00|01|02|03|04|05|06|07|08|09|0|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|1|2|3|4|5|6|7|8|9)(h)?";

    public static final String MinuteRegex = "(?<min>00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|0|1|2|3|4|5|6|7|8|9)(?!\\d)";

    public static final String SecondRegex = "(?<sec>00|01|02|03|04|05|06|07|08|09|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|0|1|2|3|4|5|6|7|8|9)";

    public static final String PmNonUnitRegex = "({HourRegex}\\s*:\\s*{MinuteRegex}(\\s*:\\s*{SecondRegex})?\\s*pm)"
            .replace("{HourRegex}", HourRegex)
            .replace("{MinuteRegex}", MinuteRegex)
            .replace("{SecondRegex}", SecondRegex);

    public static final String AmbiguousTimeTerm = "pm";

    public static final String AmbiguousUnitNumberMultiplierRegex = "(\\s([Kk]|mil))";

    public static final String SingleCharUnitRegex = "^\\b(c|f|g|k|l|m|s)(\\s*\\.|\\b)$";
}
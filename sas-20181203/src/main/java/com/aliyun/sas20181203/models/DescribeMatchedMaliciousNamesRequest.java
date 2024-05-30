// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMatchedMaliciousNamesRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **serious**</p>
     * <p>*   **suspicious**</p>
     * <p>*   **remind**</p>
     */
    @NameInMap("Levels")
    public String levels;

    public static DescribeMatchedMaliciousNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMatchedMaliciousNamesRequest self = new DescribeMatchedMaliciousNamesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMatchedMaliciousNamesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeMatchedMaliciousNamesRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

}

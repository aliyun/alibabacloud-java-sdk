// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMatchedMaliciousNamesRequest extends TeaModel {
    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The risk levels of the malicious samples in images to query. You can specify multiple values. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>serious</strong>: urgent</li>
     * <li><strong>suspicious</strong>: suspicious</li>
     * <li><strong>remind</strong>: reminder.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
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

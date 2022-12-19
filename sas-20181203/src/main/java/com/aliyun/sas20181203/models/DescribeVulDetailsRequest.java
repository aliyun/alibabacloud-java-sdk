// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDetailsRequest extends TeaModel {
    // The name in the **vulnerability introduction**.
    @NameInMap("AliasName")
    public String aliasName;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the vulnerability.
    @NameInMap("Name")
    public String name;

    // The type of the vulnerability. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerability
    // *   **app**: application vulnerability
    // *   **emg**: urgent vulnerability
    // *   **sca**: vulnerability that is detected based on software component analysis
    @NameInMap("Type")
    public String type;

    public static DescribeVulDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDetailsRequest self = new DescribeVulDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulDetailsRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeVulDetailsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVulDetailsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVulDetailsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}

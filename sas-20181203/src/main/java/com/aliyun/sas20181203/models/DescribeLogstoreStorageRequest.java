// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageRequest extends TeaModel {
    // The ID of the request source. Set the value to **sas**.
    @NameInMap("From")
    public String from;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    public static DescribeLogstoreStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstoreStorageRequest self = new DescribeLogstoreStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogstoreStorageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeLogstoreStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("From")
    public String from;

    public static DescribeLogstoreStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstoreStorageRequest self = new DescribeLogstoreStorageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLogstoreStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeLogstoreStorageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}

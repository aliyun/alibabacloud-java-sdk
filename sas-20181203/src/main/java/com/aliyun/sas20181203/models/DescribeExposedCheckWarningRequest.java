// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedCheckWarningRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("Uuids")
    public String uuids;

    public static DescribeExposedCheckWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedCheckWarningRequest self = new DescribeExposedCheckWarningRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExposedCheckWarningRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExposedCheckWarningRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public DescribeExposedCheckWarningRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}

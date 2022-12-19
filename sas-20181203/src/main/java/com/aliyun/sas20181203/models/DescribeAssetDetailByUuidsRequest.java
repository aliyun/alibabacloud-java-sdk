// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAssetDetailByUuidsRequest extends TeaModel {
    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UUIDs of the ECS instances. Separate multiple UUIDs with commas (,).
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeAssetDetailByUuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetDetailByUuidsRequest self = new DescribeAssetDetailByUuidsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetDetailByUuidsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAssetDetailByUuidsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}

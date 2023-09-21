// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerScanConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeContainerScanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerScanConfigRequest self = new DescribeContainerScanConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerScanConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}

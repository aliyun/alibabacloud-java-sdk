// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeIpReportRequest extends TeaModel {
    @NameInMap("Field")
    public String field;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("ServiceLang")
    public String serviceLang;

    public static DescribeIpReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpReportRequest self = new DescribeIpReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIpReportRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeIpReportRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeIpReportRequest setServiceLang(String serviceLang) {
        this.serviceLang = serviceLang;
        return this;
    }
    public String getServiceLang() {
        return this.serviceLang;
    }

}

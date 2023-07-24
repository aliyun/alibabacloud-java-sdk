// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeFileReportRequest extends TeaModel {
    @NameInMap("Field")
    public String field;

    @NameInMap("FileHash")
    public String fileHash;

    @NameInMap("ServiceLang")
    public String serviceLang;

    public static DescribeFileReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileReportRequest self = new DescribeFileReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileReportRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeFileReportRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public DescribeFileReportRequest setServiceLang(String serviceLang) {
        this.serviceLang = serviceLang;
        return this;
    }
    public String getServiceLang() {
        return this.serviceLang;
    }

}

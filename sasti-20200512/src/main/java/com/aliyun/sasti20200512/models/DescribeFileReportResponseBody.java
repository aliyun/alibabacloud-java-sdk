// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasti20200512.models;

import com.aliyun.tea.*;

public class DescribeFileReportResponseBody extends TeaModel {
    @NameInMap("Basic")
    public String basic;

    @NameInMap("FileHash")
    public String fileHash;

    @NameInMap("Intelligences")
    public String intelligences;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Sandbox")
    public String sandbox;

    @NameInMap("ThreatLevel")
    public String threatLevel;

    @NameInMap("ThreatTypes")
    public String threatTypes;

    public static DescribeFileReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileReportResponseBody self = new DescribeFileReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileReportResponseBody setBasic(String basic) {
        this.basic = basic;
        return this;
    }
    public String getBasic() {
        return this.basic;
    }

    public DescribeFileReportResponseBody setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public DescribeFileReportResponseBody setIntelligences(String intelligences) {
        this.intelligences = intelligences;
        return this;
    }
    public String getIntelligences() {
        return this.intelligences;
    }

    public DescribeFileReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileReportResponseBody setSandbox(String sandbox) {
        this.sandbox = sandbox;
        return this;
    }
    public String getSandbox() {
        return this.sandbox;
    }

    public DescribeFileReportResponseBody setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public DescribeFileReportResponseBody setThreatTypes(String threatTypes) {
        this.threatTypes = threatTypes;
        return this;
    }
    public String getThreatTypes() {
        return this.threatTypes;
    }

}

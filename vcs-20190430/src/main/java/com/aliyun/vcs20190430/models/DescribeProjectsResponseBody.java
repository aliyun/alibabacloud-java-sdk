// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeProjectsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeProjectsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectsResponseBody self = new DescribeProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectsResponseBody setData(java.util.List<DescribeProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeProjectsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectsResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("GbId")
        public String gbId;

        @NameInMap("GbIp")
        public String gbIp;

        @NameInMap("GbPort")
        public String gbPort;

        @NameInMap("ImageSize")
        public Float imageSize;

        @NameInMap("PackagePattern")
        public String packagePattern;

        @NameInMap("ProjectCode")
        public String projectCode;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Status")
        public String status;

        @NameInMap("StructuredSize")
        public Float structuredSize;

        @NameInMap("VectorSize")
        public Float vectorSize;

        public static DescribeProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectsResponseBodyData self = new DescribeProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProjectsResponseBodyData setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public DescribeProjectsResponseBodyData setGbId(String gbId) {
            this.gbId = gbId;
            return this;
        }
        public String getGbId() {
            return this.gbId;
        }

        public DescribeProjectsResponseBodyData setGbIp(String gbIp) {
            this.gbIp = gbIp;
            return this;
        }
        public String getGbIp() {
            return this.gbIp;
        }

        public DescribeProjectsResponseBodyData setGbPort(String gbPort) {
            this.gbPort = gbPort;
            return this;
        }
        public String getGbPort() {
            return this.gbPort;
        }

        public DescribeProjectsResponseBodyData setImageSize(Float imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Float getImageSize() {
            return this.imageSize;
        }

        public DescribeProjectsResponseBodyData setPackagePattern(String packagePattern) {
            this.packagePattern = packagePattern;
            return this;
        }
        public String getPackagePattern() {
            return this.packagePattern;
        }

        public DescribeProjectsResponseBodyData setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public DescribeProjectsResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeProjectsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeProjectsResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeProjectsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectsResponseBodyData setStructuredSize(Float structuredSize) {
            this.structuredSize = structuredSize;
            return this;
        }
        public Float getStructuredSize() {
            return this.structuredSize;
        }

        public DescribeProjectsResponseBodyData setVectorSize(Float vectorSize) {
            this.vectorSize = vectorSize;
            return this;
        }
        public Float getVectorSize() {
            return this.vectorSize;
        }

    }

}

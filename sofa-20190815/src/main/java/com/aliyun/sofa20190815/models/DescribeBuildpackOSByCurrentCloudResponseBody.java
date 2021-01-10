// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackOSByCurrentCloudResponseBody extends TeaModel {
    @NameInMap("BuildpackOs")
    public java.util.List<DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs> buildpackOs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DescribeBuildpackOSByCurrentCloudResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackOSByCurrentCloudResponseBody self = new DescribeBuildpackOSByCurrentCloudResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackOSByCurrentCloudResponseBody setBuildpackOs(java.util.List<DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs> buildpackOs) {
        this.buildpackOs = buildpackOs;
        return this;
    }
    public java.util.List<DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs> getBuildpackOs() {
        return this.buildpackOs;
    }

    public DescribeBuildpackOSByCurrentCloudResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBuildpackOSByCurrentCloudResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeBuildpackOSByCurrentCloudResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("OsBit")
        public Long osBit;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Version")
        public String version;

        @NameInMap("OsBitNum")
        public Long osBitNum;

        @NameInMap("SupportedCloudDisplayNames")
        public java.util.List<String> supportedCloudDisplayNames;

        @NameInMap("SupportedCloudNames")
        public java.util.List<String> supportedCloudNames;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs build(java.util.Map<String, ?> map) throws Exception {
            DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs self = new DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs();
            return TeaModel.build(map, self);
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setOsBit(Long osBit) {
            this.osBit = osBit;
            return this;
        }
        public Long getOsBit() {
            return this.osBit;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setOsBitNum(Long osBitNum) {
            this.osBitNum = osBitNum;
            return this;
        }
        public Long getOsBitNum() {
            return this.osBitNum;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setSupportedCloudDisplayNames(java.util.List<String> supportedCloudDisplayNames) {
            this.supportedCloudDisplayNames = supportedCloudDisplayNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudDisplayNames() {
            return this.supportedCloudDisplayNames;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setSupportedCloudNames(java.util.List<String> supportedCloudNames) {
            this.supportedCloudNames = supportedCloudNames;
            return this;
        }
        public java.util.List<String> getSupportedCloudNames() {
            return this.supportedCloudNames;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBuildpackOSByCurrentCloudResponseBodyBuildpackOs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}

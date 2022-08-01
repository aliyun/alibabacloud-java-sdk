// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateOssShipperRequest extends TeaModel {
    @NameInMap("shipperName")
    public String shipperName;

    @NameInMap("targetConfiguration")
    public CreateOssShipperRequestTargetConfiguration targetConfiguration;

    @NameInMap("targetType")
    public String targetType;

    public static CreateOssShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOssShipperRequest self = new CreateOssShipperRequest();
        return TeaModel.build(map, self);
    }

    public CreateOssShipperRequest setShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }
    public String getShipperName() {
        return this.shipperName;
    }

    public CreateOssShipperRequest setTargetConfiguration(CreateOssShipperRequestTargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public CreateOssShipperRequestTargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public CreateOssShipperRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class CreateOssShipperRequestTargetConfigurationStorage extends TeaModel {
        @NameInMap("detail")
        public java.util.Map<String, ?> detail;

        @NameInMap("format")
        public String format;

        public static CreateOssShipperRequestTargetConfigurationStorage build(java.util.Map<String, ?> map) throws Exception {
            CreateOssShipperRequestTargetConfigurationStorage self = new CreateOssShipperRequestTargetConfigurationStorage();
            return TeaModel.build(map, self);
        }

        public CreateOssShipperRequestTargetConfigurationStorage setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public CreateOssShipperRequestTargetConfigurationStorage setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class CreateOssShipperRequestTargetConfiguration extends TeaModel {
        @NameInMap("bufferInterval")
        public Integer bufferInterval;

        @NameInMap("bufferSize")
        public Integer bufferSize;

        @NameInMap("compressType")
        public String compressType;

        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("ossBucket")
        public String ossBucket;

        @NameInMap("ossPrefix")
        public String ossPrefix;

        @NameInMap("pathFormat")
        public String pathFormat;

        @NameInMap("roleArn")
        public String roleArn;

        @NameInMap("storage")
        public CreateOssShipperRequestTargetConfigurationStorage storage;

        @NameInMap("timeZone")
        public String timeZone;

        public static CreateOssShipperRequestTargetConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateOssShipperRequestTargetConfiguration self = new CreateOssShipperRequestTargetConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateOssShipperRequestTargetConfiguration setBufferInterval(Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Integer getBufferInterval() {
            return this.bufferInterval;
        }

        public CreateOssShipperRequestTargetConfiguration setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public CreateOssShipperRequestTargetConfiguration setCompressType(String compressType) {
            this.compressType = compressType;
            return this;
        }
        public String getCompressType() {
            return this.compressType;
        }

        public CreateOssShipperRequestTargetConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateOssShipperRequestTargetConfiguration setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public CreateOssShipperRequestTargetConfiguration setOssPrefix(String ossPrefix) {
            this.ossPrefix = ossPrefix;
            return this;
        }
        public String getOssPrefix() {
            return this.ossPrefix;
        }

        public CreateOssShipperRequestTargetConfiguration setPathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
            return this;
        }
        public String getPathFormat() {
            return this.pathFormat;
        }

        public CreateOssShipperRequestTargetConfiguration setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public CreateOssShipperRequestTargetConfiguration setStorage(CreateOssShipperRequestTargetConfigurationStorage storage) {
            this.storage = storage;
            return this;
        }
        public CreateOssShipperRequestTargetConfigurationStorage getStorage() {
            return this.storage;
        }

        public CreateOssShipperRequestTargetConfiguration setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}

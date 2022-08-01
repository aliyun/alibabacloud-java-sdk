// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateOssShipperRequest extends TeaModel {
    @NameInMap("shipperName")
    public String shipperName;

    @NameInMap("targetConfiguration")
    public UpdateOssShipperRequestTargetConfiguration targetConfiguration;

    @NameInMap("targetType")
    public String targetType;

    public static UpdateOssShipperRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssShipperRequest self = new UpdateOssShipperRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssShipperRequest setShipperName(String shipperName) {
        this.shipperName = shipperName;
        return this;
    }
    public String getShipperName() {
        return this.shipperName;
    }

    public UpdateOssShipperRequest setTargetConfiguration(UpdateOssShipperRequestTargetConfiguration targetConfiguration) {
        this.targetConfiguration = targetConfiguration;
        return this;
    }
    public UpdateOssShipperRequestTargetConfiguration getTargetConfiguration() {
        return this.targetConfiguration;
    }

    public UpdateOssShipperRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class UpdateOssShipperRequestTargetConfigurationStorage extends TeaModel {
        @NameInMap("detail")
        public java.util.Map<String, ?> detail;

        @NameInMap("format")
        public String format;

        public static UpdateOssShipperRequestTargetConfigurationStorage build(java.util.Map<String, ?> map) throws Exception {
            UpdateOssShipperRequestTargetConfigurationStorage self = new UpdateOssShipperRequestTargetConfigurationStorage();
            return TeaModel.build(map, self);
        }

        public UpdateOssShipperRequestTargetConfigurationStorage setDetail(java.util.Map<String, ?> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.Map<String, ?> getDetail() {
            return this.detail;
        }

        public UpdateOssShipperRequestTargetConfigurationStorage setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class UpdateOssShipperRequestTargetConfiguration extends TeaModel {
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
        public UpdateOssShipperRequestTargetConfigurationStorage storage;

        @NameInMap("timeZone")
        public String timeZone;

        public static UpdateOssShipperRequestTargetConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateOssShipperRequestTargetConfiguration self = new UpdateOssShipperRequestTargetConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateOssShipperRequestTargetConfiguration setBufferInterval(Integer bufferInterval) {
            this.bufferInterval = bufferInterval;
            return this;
        }
        public Integer getBufferInterval() {
            return this.bufferInterval;
        }

        public UpdateOssShipperRequestTargetConfiguration setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public UpdateOssShipperRequestTargetConfiguration setCompressType(String compressType) {
            this.compressType = compressType;
            return this;
        }
        public String getCompressType() {
            return this.compressType;
        }

        public UpdateOssShipperRequestTargetConfiguration setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateOssShipperRequestTargetConfiguration setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public UpdateOssShipperRequestTargetConfiguration setOssPrefix(String ossPrefix) {
            this.ossPrefix = ossPrefix;
            return this;
        }
        public String getOssPrefix() {
            return this.ossPrefix;
        }

        public UpdateOssShipperRequestTargetConfiguration setPathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
            return this;
        }
        public String getPathFormat() {
            return this.pathFormat;
        }

        public UpdateOssShipperRequestTargetConfiguration setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public UpdateOssShipperRequestTargetConfiguration setStorage(UpdateOssShipperRequestTargetConfigurationStorage storage) {
            this.storage = storage;
            return this;
        }
        public UpdateOssShipperRequestTargetConfigurationStorage getStorage() {
            return this.storage;
        }

        public UpdateOssShipperRequestTargetConfiguration setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

}

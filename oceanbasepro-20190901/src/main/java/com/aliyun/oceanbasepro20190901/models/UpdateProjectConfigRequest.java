// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateProjectConfigRequest extends TeaModel {
    @NameInMap("FullTransferConfig")
    public UpdateProjectConfigRequestFullTransferConfig fullTransferConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("IncrTransferConfig")
    public UpdateProjectConfigRequestIncrTransferConfig incrTransferConfig;

    @NameInMap("ReverseIncrTransferConfig")
    public UpdateProjectConfigRequestReverseIncrTransferConfig reverseIncrTransferConfig;

    public static UpdateProjectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectConfigRequest self = new UpdateProjectConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectConfigRequest setFullTransferConfig(UpdateProjectConfigRequestFullTransferConfig fullTransferConfig) {
        this.fullTransferConfig = fullTransferConfig;
        return this;
    }
    public UpdateProjectConfigRequestFullTransferConfig getFullTransferConfig() {
        return this.fullTransferConfig;
    }

    public UpdateProjectConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateProjectConfigRequest setIncrTransferConfig(UpdateProjectConfigRequestIncrTransferConfig incrTransferConfig) {
        this.incrTransferConfig = incrTransferConfig;
        return this;
    }
    public UpdateProjectConfigRequestIncrTransferConfig getIncrTransferConfig() {
        return this.incrTransferConfig;
    }

    public UpdateProjectConfigRequest setReverseIncrTransferConfig(UpdateProjectConfigRequestReverseIncrTransferConfig reverseIncrTransferConfig) {
        this.reverseIncrTransferConfig = reverseIncrTransferConfig;
        return this;
    }
    public UpdateProjectConfigRequestReverseIncrTransferConfig getReverseIncrTransferConfig() {
        return this.reverseIncrTransferConfig;
    }

    public static class UpdateProjectConfigRequestFullTransferConfig extends TeaModel {
        @NameInMap("ReadWorkerNum")
        public Integer readWorkerNum;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        @NameInMap("WriteWorkerNum")
        public Integer writeWorkerNum;

        public static UpdateProjectConfigRequestFullTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectConfigRequestFullTransferConfig self = new UpdateProjectConfigRequestFullTransferConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProjectConfigRequestFullTransferConfig setReadWorkerNum(Integer readWorkerNum) {
            this.readWorkerNum = readWorkerNum;
            return this;
        }
        public Integer getReadWorkerNum() {
            return this.readWorkerNum;
        }

        public UpdateProjectConfigRequestFullTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public UpdateProjectConfigRequestFullTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

        public UpdateProjectConfigRequestFullTransferConfig setWriteWorkerNum(Integer writeWorkerNum) {
            this.writeWorkerNum = writeWorkerNum;
            return this;
        }
        public Integer getWriteWorkerNum() {
            return this.writeWorkerNum;
        }

    }

    public static class UpdateProjectConfigRequestIncrTransferConfig extends TeaModel {
        @NameInMap("IncrSyncThreadCount")
        public Integer incrSyncThreadCount;

        @NameInMap("RecordTypeWhiteList")
        public java.util.List<String> recordTypeWhiteList;

        @NameInMap("SupportDDLTypes")
        public java.util.List<String> supportDDLTypes;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        public static UpdateProjectConfigRequestIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectConfigRequestIncrTransferConfig self = new UpdateProjectConfigRequestIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProjectConfigRequestIncrTransferConfig setIncrSyncThreadCount(Integer incrSyncThreadCount) {
            this.incrSyncThreadCount = incrSyncThreadCount;
            return this;
        }
        public Integer getIncrSyncThreadCount() {
            return this.incrSyncThreadCount;
        }

        public UpdateProjectConfigRequestIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public UpdateProjectConfigRequestIncrTransferConfig setSupportDDLTypes(java.util.List<String> supportDDLTypes) {
            this.supportDDLTypes = supportDDLTypes;
            return this;
        }
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        public UpdateProjectConfigRequestIncrTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public UpdateProjectConfigRequestIncrTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

    }

    public static class UpdateProjectConfigRequestReverseIncrTransferConfig extends TeaModel {
        @NameInMap("IncrSyncThreadCount")
        public Integer incrSyncThreadCount;

        @NameInMap("RecordTypeWhiteList")
        public java.util.List<String> recordTypeWhiteList;

        @NameInMap("SupportDDLTypes")
        public java.util.List<String> supportDDLTypes;

        @NameInMap("ThrottleIOPS")
        public Integer throttleIOPS;

        @NameInMap("ThrottleRps")
        public Integer throttleRps;

        public static UpdateProjectConfigRequestReverseIncrTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectConfigRequestReverseIncrTransferConfig self = new UpdateProjectConfigRequestReverseIncrTransferConfig();
            return TeaModel.build(map, self);
        }

        public UpdateProjectConfigRequestReverseIncrTransferConfig setIncrSyncThreadCount(Integer incrSyncThreadCount) {
            this.incrSyncThreadCount = incrSyncThreadCount;
            return this;
        }
        public Integer getIncrSyncThreadCount() {
            return this.incrSyncThreadCount;
        }

        public UpdateProjectConfigRequestReverseIncrTransferConfig setRecordTypeWhiteList(java.util.List<String> recordTypeWhiteList) {
            this.recordTypeWhiteList = recordTypeWhiteList;
            return this;
        }
        public java.util.List<String> getRecordTypeWhiteList() {
            return this.recordTypeWhiteList;
        }

        public UpdateProjectConfigRequestReverseIncrTransferConfig setSupportDDLTypes(java.util.List<String> supportDDLTypes) {
            this.supportDDLTypes = supportDDLTypes;
            return this;
        }
        public java.util.List<String> getSupportDDLTypes() {
            return this.supportDDLTypes;
        }

        public UpdateProjectConfigRequestReverseIncrTransferConfig setThrottleIOPS(Integer throttleIOPS) {
            this.throttleIOPS = throttleIOPS;
            return this;
        }
        public Integer getThrottleIOPS() {
            return this.throttleIOPS;
        }

        public UpdateProjectConfigRequestReverseIncrTransferConfig setThrottleRps(Integer throttleRps) {
            this.throttleRps = throttleRps;
            return this;
        }
        public Integer getThrottleRps() {
            return this.throttleRps;
        }

    }

}

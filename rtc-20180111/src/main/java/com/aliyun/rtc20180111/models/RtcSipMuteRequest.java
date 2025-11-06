// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipMuteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eo85****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testid</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operations")
    public java.util.List<RtcSipMuteRequestOperations> operations;

    public static RtcSipMuteRequest build(java.util.Map<String, ?> map) throws Exception {
        RtcSipMuteRequest self = new RtcSipMuteRequest();
        return TeaModel.build(map, self);
    }

    public RtcSipMuteRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RtcSipMuteRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public RtcSipMuteRequest setOperations(java.util.List<RtcSipMuteRequestOperations> operations) {
        this.operations = operations;
        return this;
    }
    public java.util.List<RtcSipMuteRequestOperations> getOperations() {
        return this.operations;
    }

    public static class RtcSipMuteRequestOperationsValue extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inactive</p>
         */
        @NameInMap("Status")
        public String status;

        public static RtcSipMuteRequestOperationsValue build(java.util.Map<String, ?> map) throws Exception {
            RtcSipMuteRequestOperationsValue self = new RtcSipMuteRequestOperationsValue();
            return TeaModel.build(map, self);
        }

        public RtcSipMuteRequestOperationsValue setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class RtcSipMuteRequestOperations extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>replace</p>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12122121</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/media/audio/status</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Value")
        public RtcSipMuteRequestOperationsValue value;

        public static RtcSipMuteRequestOperations build(java.util.Map<String, ?> map) throws Exception {
            RtcSipMuteRequestOperations self = new RtcSipMuteRequestOperations();
            return TeaModel.build(map, self);
        }

        public RtcSipMuteRequestOperations setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public RtcSipMuteRequestOperations setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public RtcSipMuteRequestOperations setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public RtcSipMuteRequestOperations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public RtcSipMuteRequestOperations setValue(RtcSipMuteRequestOperationsValue value) {
            this.value = value;
            return this;
        }
        public RtcSipMuteRequestOperationsValue getValue() {
            return this.value;
        }

    }

}

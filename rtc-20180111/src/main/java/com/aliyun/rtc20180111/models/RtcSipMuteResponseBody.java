// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipMuteResponseBody extends TeaModel {
    @NameInMap("ErrTracks")
    public java.util.List<RtcSipMuteResponseBodyErrTracks> errTracks;

    /**
     * <strong>example:</strong>
     * <p>E7997404-5858-5C4D-94E4-33677412ACDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RtcSipMuteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RtcSipMuteResponseBody self = new RtcSipMuteResponseBody();
        return TeaModel.build(map, self);
    }

    public RtcSipMuteResponseBody setErrTracks(java.util.List<RtcSipMuteResponseBodyErrTracks> errTracks) {
        this.errTracks = errTracks;
        return this;
    }
    public java.util.List<RtcSipMuteResponseBodyErrTracks> getErrTracks() {
        return this.errTracks;
    }

    public RtcSipMuteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RtcSipMuteResponseBodyErrTracks extends TeaModel {
        /**
         * <p>ErrMsg。</p>
         * 
         * <strong>example:</strong>
         * <p>participant does not existed.</p>
         */
        @NameInMap("ErrMsg")
        public String errMsg;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>OperationId。</p>
         * 
         * <strong>example:</strong>
         * <p>12122121</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        public static RtcSipMuteResponseBodyErrTracks build(java.util.Map<String, ?> map) throws Exception {
            RtcSipMuteResponseBodyErrTracks self = new RtcSipMuteResponseBodyErrTracks();
            return TeaModel.build(map, self);
        }

        public RtcSipMuteResponseBodyErrTracks setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public RtcSipMuteResponseBodyErrTracks setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RtcSipMuteResponseBodyErrTracks setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

    }

}

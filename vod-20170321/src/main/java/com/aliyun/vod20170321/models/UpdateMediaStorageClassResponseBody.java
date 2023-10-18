// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateMediaStorageClassResponseBody extends TeaModel {
    /**
     * <p>The IDs of the media assets that failed to be processed.</p>
     */
    @NameInMap("ForbiddenList")
    public UpdateMediaStorageClassResponseBodyForbiddenList forbiddenList;

    /**
     * <p>The IDs of the media assets that failed to be obtained.</p>
     */
    @NameInMap("IgnoredList")
    public UpdateMediaStorageClassResponseBodyIgnoredList ignoredList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the task. Valid values:</p>
     * <br>
     * <p>*   **Processing**</p>
     * <p>*   **Failed**</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateMediaStorageClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaStorageClassResponseBody self = new UpdateMediaStorageClassResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaStorageClassResponseBody setForbiddenList(UpdateMediaStorageClassResponseBodyForbiddenList forbiddenList) {
        this.forbiddenList = forbiddenList;
        return this;
    }
    public UpdateMediaStorageClassResponseBodyForbiddenList getForbiddenList() {
        return this.forbiddenList;
    }

    public UpdateMediaStorageClassResponseBody setIgnoredList(UpdateMediaStorageClassResponseBodyIgnoredList ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public UpdateMediaStorageClassResponseBodyIgnoredList getIgnoredList() {
        return this.ignoredList;
    }

    public UpdateMediaStorageClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMediaStorageClassResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO extends TeaModel {
        /**
         * <p>The ID of the media asset.</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The reason for the failure.</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO self = new UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO();
            return TeaModel.build(map, self);
        }

        public UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class UpdateMediaStorageClassResponseBodyForbiddenList extends TeaModel {
        @NameInMap("MediaForbiddenReasonDTO")
        public java.util.List<UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO> mediaForbiddenReasonDTO;

        public static UpdateMediaStorageClassResponseBodyForbiddenList build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaStorageClassResponseBodyForbiddenList self = new UpdateMediaStorageClassResponseBodyForbiddenList();
            return TeaModel.build(map, self);
        }

        public UpdateMediaStorageClassResponseBodyForbiddenList setMediaForbiddenReasonDTO(java.util.List<UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO> mediaForbiddenReasonDTO) {
            this.mediaForbiddenReasonDTO = mediaForbiddenReasonDTO;
            return this;
        }
        public java.util.List<UpdateMediaStorageClassResponseBodyForbiddenListMediaForbiddenReasonDTO> getMediaForbiddenReasonDTO() {
            return this.mediaForbiddenReasonDTO;
        }

    }

    public static class UpdateMediaStorageClassResponseBodyIgnoredList extends TeaModel {
        @NameInMap("MediaId")
        public java.util.List<String> mediaId;

        public static UpdateMediaStorageClassResponseBodyIgnoredList build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaStorageClassResponseBodyIgnoredList self = new UpdateMediaStorageClassResponseBodyIgnoredList();
            return TeaModel.build(map, self);
        }

        public UpdateMediaStorageClassResponseBodyIgnoredList setMediaId(java.util.List<String> mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public java.util.List<String> getMediaId() {
            return this.mediaId;
        }

    }

}

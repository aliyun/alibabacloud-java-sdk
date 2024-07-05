// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaResponseBody extends TeaModel {
    /**
     * <p>The IDs of the media asset that failed to be processed.</p>
     */
    @NameInMap("ForbiddenList")
    public RestoreMediaResponseBodyForbiddenList forbiddenList;

    /**
     * <p>The IDs of the media assets that failed to be obtained.</p>
     */
    @NameInMap("IgnoredList")
    public RestoreMediaResponseBodyIgnoredList ignoredList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8E70E3F8-E2EE-47BC-4677-379D6F28****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static RestoreMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreMediaResponseBody self = new RestoreMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreMediaResponseBody setForbiddenList(RestoreMediaResponseBodyForbiddenList forbiddenList) {
        this.forbiddenList = forbiddenList;
        return this;
    }
    public RestoreMediaResponseBodyForbiddenList getForbiddenList() {
        return this.forbiddenList;
    }

    public RestoreMediaResponseBody setIgnoredList(RestoreMediaResponseBodyIgnoredList ignoredList) {
        this.ignoredList = ignoredList;
        return this;
    }
    public RestoreMediaResponseBodyIgnoredList getIgnoredList() {
        return this.ignoredList;
    }

    public RestoreMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RestoreMediaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO extends TeaModel {
        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>fa10ee70898671edb99f6eb3690d****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Forbidden.RestoreMedia</p>
         */
        @NameInMap("Reason")
        public String reason;

        public static RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO build(java.util.Map<String, ?> map) throws Exception {
            RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO self = new RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO();
            return TeaModel.build(map, self);
        }

        public RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

    public static class RestoreMediaResponseBodyForbiddenList extends TeaModel {
        @NameInMap("MediaForbiddenReasonDTO")
        public java.util.List<RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO> mediaForbiddenReasonDTO;

        public static RestoreMediaResponseBodyForbiddenList build(java.util.Map<String, ?> map) throws Exception {
            RestoreMediaResponseBodyForbiddenList self = new RestoreMediaResponseBodyForbiddenList();
            return TeaModel.build(map, self);
        }

        public RestoreMediaResponseBodyForbiddenList setMediaForbiddenReasonDTO(java.util.List<RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO> mediaForbiddenReasonDTO) {
            this.mediaForbiddenReasonDTO = mediaForbiddenReasonDTO;
            return this;
        }
        public java.util.List<RestoreMediaResponseBodyForbiddenListMediaForbiddenReasonDTO> getMediaForbiddenReasonDTO() {
            return this.mediaForbiddenReasonDTO;
        }

    }

    public static class RestoreMediaResponseBodyIgnoredList extends TeaModel {
        @NameInMap("MediaId")
        public java.util.List<String> mediaId;

        public static RestoreMediaResponseBodyIgnoredList build(java.util.Map<String, ?> map) throws Exception {
            RestoreMediaResponseBodyIgnoredList self = new RestoreMediaResponseBodyIgnoredList();
            return TeaModel.build(map, self);
        }

        public RestoreMediaResponseBodyIgnoredList setMediaId(java.util.List<String> mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public java.util.List<String> getMediaId() {
            return this.mediaId;
        }

    }

}

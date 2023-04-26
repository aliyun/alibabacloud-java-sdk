// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RestoreMediaResponseBody extends TeaModel {
    @NameInMap("ForbiddenList")
    public RestoreMediaResponseBodyForbiddenList forbiddenList;

    @NameInMap("IgnoredList")
    public RestoreMediaResponseBodyIgnoredList ignoredList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("MediaId")
        public String mediaId;

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

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponseBody extends TeaModel {
    // The URLs of the media files that failed to be registered.
    @NameInMap("FailedFileURLs")
    public java.util.List<String> failedFileURLs;

    // The media files that are registered, including newly registered and repeatedly registered media files.
    @NameInMap("RegisteredMediaList")
    public java.util.List<RegisterMediaResponseBodyRegisteredMediaList> registeredMediaList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static RegisterMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaResponseBody self = new RegisterMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaResponseBody setFailedFileURLs(java.util.List<String> failedFileURLs) {
        this.failedFileURLs = failedFileURLs;
        return this;
    }
    public java.util.List<String> getFailedFileURLs() {
        return this.failedFileURLs;
    }

    public RegisterMediaResponseBody setRegisteredMediaList(java.util.List<RegisterMediaResponseBodyRegisteredMediaList> registeredMediaList) {
        this.registeredMediaList = registeredMediaList;
        return this;
    }
    public java.util.List<RegisterMediaResponseBodyRegisteredMediaList> getRegisteredMediaList() {
        return this.registeredMediaList;
    }

    public RegisterMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterMediaResponseBodyRegisteredMediaList extends TeaModel {
        // The OSS URL of the media file.
        @NameInMap("FileURL")
        public String fileURL;

        // The ID of the media file that is registered with ApsaraVideo VOD. If the registered media file is an audio or video file, the value of the VideoId parameter returned by ApsaraVideo VOD takes effect.
        @NameInMap("MediaId")
        public String mediaId;

        // Indicates whether the media file is newly registered or repeatedly registered. Valid values:  
        // - **true**: The media file is newly registered.
        // - **false**: The media file is repeatedly registered.
        @NameInMap("NewRegister")
        public Boolean newRegister;

        public static RegisterMediaResponseBodyRegisteredMediaList build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaResponseBodyRegisteredMediaList self = new RegisterMediaResponseBodyRegisteredMediaList();
            return TeaModel.build(map, self);
        }

        public RegisterMediaResponseBodyRegisteredMediaList setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public RegisterMediaResponseBodyRegisteredMediaList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public RegisterMediaResponseBodyRegisteredMediaList setNewRegister(Boolean newRegister) {
            this.newRegister = newRegister;
            return this;
        }
        public Boolean getNewRegister() {
            return this.newRegister;
        }

    }

}

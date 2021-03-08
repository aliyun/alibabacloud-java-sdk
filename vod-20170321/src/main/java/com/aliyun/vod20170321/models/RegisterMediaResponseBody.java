// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailedFileURLs")
    public java.util.List<String> failedFileURLs;

    @NameInMap("RegisteredMediaList")
    public java.util.List<RegisterMediaResponseBodyRegisteredMediaList> registeredMediaList;

    public static RegisterMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaResponseBody self = new RegisterMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public static class RegisterMediaResponseBodyRegisteredMediaList extends TeaModel {
        @NameInMap("NewRegister")
        public Boolean newRegister;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("MediaId")
        public String mediaId;

        public static RegisterMediaResponseBodyRegisteredMediaList build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaResponseBodyRegisteredMediaList self = new RegisterMediaResponseBodyRegisteredMediaList();
            return TeaModel.build(map, self);
        }

        public RegisterMediaResponseBodyRegisteredMediaList setNewRegister(Boolean newRegister) {
            this.newRegister = newRegister;
            return this;
        }
        public Boolean getNewRegister() {
            return this.newRegister;
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

    }

}

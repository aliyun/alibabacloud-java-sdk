// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponseBody extends TeaModel {
    /**
     * <p>The list of file URLs that failed to be registered.</p>
     */
    @NameInMap("FailedFileURLs")
    public java.util.List<String> failedFileURLs;

    /**
     * <p>The list of media assets that are successfully registered, including both newly registered files and previously registered files.</p>
     */
    @NameInMap("RegisteredMediaList")
    public java.util.List<RegisterMediaResponseBodyRegisteredMediaList> registeredMediaList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14F43C5C-8033-448B-AD04F64E5098****</p>
     */
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
        /**
         * <p>The OSS file URL.</p>
         * 
         * <strong>example:</strong>
         * <p>http://****.oss-cn-shanghai.aliyuncs.com/vod_sample_01.mp4</p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The VOD media ID. If the registered media file is an audio or video file, this value corresponds to the VideoId in ApsaraVideo VOD.</p>
         * 
         * <strong>example:</strong>
         * <p>d97af32828084d1896683b1aa38****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>Indicates whether the media asset is newly registered or repeatedly registered.</p>
         * <ul>
         * <li><strong>true</strong>: newly registered.</li>
         * <li><strong>false</strong>: repeatedly registered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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

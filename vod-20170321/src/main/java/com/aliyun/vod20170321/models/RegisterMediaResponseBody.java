// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RegisterMediaResponseBody extends TeaModel {
    /**
     * <p>## RegisterMetadata</p>
     * <br>
     * <p>The following table describes the metadata of the media file that you want to register. </p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| FileURL | String | Yes | The OSS URL of the source file. You can call the [GetMezzanineInfo](~~GetMezzanineInfo~~) operation to obtain the OSS URL of the source file.  <br>The URL can be up to 1,024 bytes in length. The file name must be globally unique. If the media file that you want to register is registered before, the unique media ID that is associated with the media file is returned. |</p>
     * <p>| Title | String | Yes | The title of the media file. The title can be up to 128 bytes in length. The value must be encoded in UTF-8. |</p>
     * <p>| Description | String | No | The description of the media file. The description can be up to 1,024 bytes in length. The value must be encoded in UTF-8. |</p>
     * <p>| Tags | String | No | The one or more tags of the media file. Each tag can be up to 32 bytes in length. You can specify a maximum of 16 tags. Separate multiple tags with commas (,). The value must be encoded in UTF-8. |</p>
     * <p>| CoverURL | String | No | The URL of the thumbnail. The URL can be up to 1,024 bytes in length. |</p>
     * <p>| CateId | Long | No | The category ID of the media file. You can use one of the following methods to obtain the category ID: <br>Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com/). In the left-side navigation pane, choose **Configuration Management** > **Media Management** > **Categories**. On the Categories page, you can view the category ID of the media file.  <br>View the value of the CateId parameter returned by the [AddCategory](~~AddCategory~~) operation that you called to create a category.  <br>View the value of the CateId parameter returned by the [GetCategories](~~GetCategories~~) operation that you called to query a category. |</p>
     */
    @NameInMap("FailedFileURLs")
    public java.util.List<String> failedFileURLs;

    @NameInMap("RegisteredMediaList")
    public java.util.List<RegisterMediaResponseBodyRegisteredMediaList> registeredMediaList;

    /**
     * <p>The OSS URL of the media file.</p>
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
        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("MediaId")
        public String mediaId;

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

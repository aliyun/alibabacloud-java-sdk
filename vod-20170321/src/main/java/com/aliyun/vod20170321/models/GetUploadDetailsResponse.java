// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUploadDetailsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UploadDetails")
    @Validation(required = true)
    public java.util.List<GetUploadDetailsResponseUploadDetails> uploadDetails;

    @NameInMap("NonExistMediaIds")
    @Validation(required = true)
    public java.util.List<String> nonExistMediaIds;

    @NameInMap("ForbiddenMediaIds")
    @Validation(required = true)
    public java.util.List<String> forbiddenMediaIds;

    public static GetUploadDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDetailsResponse self = new GetUploadDetailsResponse();
        return TeaModel.build(map, self);
    }

    public static class GetUploadDetailsResponseUploadDetails extends TeaModel {
        @NameInMap("MediaId")
        @Validation(required = true)
        public String mediaId;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("FileSize")
        @Validation(required = true)
        public Long fileSize;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UploadStatus")
        @Validation(required = true)
        public String uploadStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("ModificationTime")
        @Validation(required = true)
        public String modificationTime;

        @NameInMap("CompletionTime")
        @Validation(required = true)
        public String completionTime;

        @NameInMap("UploadSize")
        @Validation(required = true)
        public Long uploadSize;

        @NameInMap("UploadRatio")
        @Validation(required = true)
        public Double uploadRatio;

        @NameInMap("UploadIP")
        @Validation(required = true)
        public String uploadIP;

        @NameInMap("UploadSource")
        @Validation(required = true)
        public String uploadSource;

        @NameInMap("DeviceModel")
        @Validation(required = true)
        public String deviceModel;

        public static GetUploadDetailsResponseUploadDetails build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDetailsResponseUploadDetails self = new GetUploadDetailsResponseUploadDetails();
            return TeaModel.build(map, self);
        }

    }

}

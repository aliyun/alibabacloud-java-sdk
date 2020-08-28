// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class UploadFileFromOSSResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("PtsDataFile")
    @Validation(required = true)
    public UploadFileFromOSSResponsePtsDataFile ptsDataFile;

    public static UploadFileFromOSSResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadFileFromOSSResponse self = new UploadFileFromOSSResponse();
        return TeaModel.build(map, self);
    }

    public static class UploadFileFromOSSResponsePtsDataFile extends TeaModel {
        @NameInMap("FileKey")
        @Validation(required = true)
        public String fileKey;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("OssUrl")
        @Validation(required = true)
        public java.util.Map<String, ?> ossUrl;

        @NameInMap("LineCount")
        @Validation(required = true)
        public Long lineCount;

        @NameInMap("SkipFirstLine")
        @Validation(required = true)
        public Boolean skipFirstLine;

        @NameInMap("Delimiter")
        @Validation(required = true)
        public String delimiter;

        @NameInMap("Length")
        @Validation(required = true)
        public Long length;

        @NameInMap("Columns")
        @Validation(required = true)
        public String columns;

        @NameInMap("UseOnce")
        @Validation(required = true)
        public Boolean useOnce;

        @NameInMap("GmtCreateTS")
        @Validation(required = true)
        public Long gmtCreateTS;

        public static UploadFileFromOSSResponsePtsDataFile build(java.util.Map<String, ?> map) throws Exception {
            UploadFileFromOSSResponsePtsDataFile self = new UploadFileFromOSSResponsePtsDataFile();
            return TeaModel.build(map, self);
        }

    }

}

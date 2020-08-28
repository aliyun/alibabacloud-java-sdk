// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SearchFaceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SearchFaceResponseData data;

    public static SearchFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceResponse self = new SearchFaceResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchFaceResponseDataRecords extends TeaModel {
        @NameInMap("GbId")
        @Validation(required = true)
        public String gbId;

        @NameInMap("ImageUrl")
        @Validation(required = true)
        public String imageUrl;

        @NameInMap("LeftTopX")
        @Validation(required = true)
        public Double leftTopX;

        @NameInMap("LeftTopY")
        @Validation(required = true)
        public Double leftTopY;

        @NameInMap("RightBottomX")
        @Validation(required = true)
        public Double rightBottomX;

        @NameInMap("RightBottomY")
        @Validation(required = true)
        public Double rightBottomY;

        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        @NameInMap("TargetImageUrl")
        @Validation(required = true)
        public String targetImageUrl;

        public static SearchFaceResponseDataRecords build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseDataRecords self = new SearchFaceResponseDataRecords();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchFaceResponseData extends TeaModel {
        @NameInMap("PageNo")
        @Validation(required = true)
        public Integer pageNo;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("TotalPage")
        @Validation(required = true)
        public Integer totalPage;

        @NameInMap("Records")
        @Validation(required = true)
        public java.util.List<SearchFaceResponseDataRecords> records;

        public static SearchFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            SearchFaceResponseData self = new SearchFaceResponseData();
            return TeaModel.build(map, self);
        }

    }

}

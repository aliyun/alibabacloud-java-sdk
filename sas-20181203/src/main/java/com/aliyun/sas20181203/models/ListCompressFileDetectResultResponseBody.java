// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCompressFileDetectResultResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListCompressFileDetectResultResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultList")
    public java.util.List<ListCompressFileDetectResultResponseBodyResultList> resultList;

    public static ListCompressFileDetectResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCompressFileDetectResultResponseBody self = new ListCompressFileDetectResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCompressFileDetectResultResponseBody setPageInfo(ListCompressFileDetectResultResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCompressFileDetectResultResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCompressFileDetectResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCompressFileDetectResultResponseBody setResultList(java.util.List<ListCompressFileDetectResultResponseBodyResultList> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<ListCompressFileDetectResultResponseBodyResultList> getResultList() {
        return this.resultList;
    }

    public static class ListCompressFileDetectResultResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCompressFileDetectResultResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCompressFileDetectResultResponseBodyPageInfo self = new ListCompressFileDetectResultResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCompressFileDetectResultResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCompressFileDetectResultResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCompressFileDetectResultResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListCompressFileDetectResultResponseBodyResultList extends TeaModel {
        @NameInMap("Ext")
        public String ext;

        @NameInMap("HashKey")
        public String hashKey;

        @NameInMap("Path")
        public String path;

        @NameInMap("Result")
        public Integer result;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("VirusType")
        public String virusType;

        public static ListCompressFileDetectResultResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            ListCompressFileDetectResultResponseBodyResultList self = new ListCompressFileDetectResultResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public ListCompressFileDetectResultResponseBodyResultList setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public ListCompressFileDetectResultResponseBodyResultList setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public ListCompressFileDetectResultResponseBodyResultList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListCompressFileDetectResultResponseBodyResultList setResult(Integer result) {
            this.result = result;
            return this;
        }
        public Integer getResult() {
            return this.result;
        }

        public ListCompressFileDetectResultResponseBodyResultList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ListCompressFileDetectResultResponseBodyResultList setVirusType(String virusType) {
            this.virusType = virusType;
            return this;
        }
        public String getVirusType() {
            return this.virusType;
        }

    }

}

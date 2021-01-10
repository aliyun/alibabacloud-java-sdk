// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskDataNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageCount")
    public Long pageCount;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("DataNodeInfos")
    public java.util.List<ListClriskDataNodesResponseBodyDataNodeInfos> dataNodeInfos;

    public static ListClriskDataNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskDataNodesResponseBody self = new ListClriskDataNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskDataNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskDataNodesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskDataNodesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskDataNodesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskDataNodesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskDataNodesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskDataNodesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskDataNodesResponseBody setDataNodeInfos(java.util.List<ListClriskDataNodesResponseBodyDataNodeInfos> dataNodeInfos) {
        this.dataNodeInfos = dataNodeInfos;
        return this;
    }
    public java.util.List<ListClriskDataNodesResponseBodyDataNodeInfos> getDataNodeInfos() {
        return this.dataNodeInfos;
    }

    public static class ListClriskDataNodesResponseBodyDataNodeInfos extends TeaModel {
        @NameInMap("DataNodeCode")
        public String dataNodeCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RelatedEntranceCount")
        public Long relatedEntranceCount;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListClriskDataNodesResponseBodyDataNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskDataNodesResponseBodyDataNodeInfos self = new ListClriskDataNodesResponseBodyDataNodeInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskDataNodesResponseBodyDataNodeInfos setDataNodeCode(String dataNodeCode) {
            this.dataNodeCode = dataNodeCode;
            return this;
        }
        public String getDataNodeCode() {
            return this.dataNodeCode;
        }

        public ListClriskDataNodesResponseBodyDataNodeInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskDataNodesResponseBodyDataNodeInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListClriskDataNodesResponseBodyDataNodeInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskDataNodesResponseBodyDataNodeInfos setRelatedEntranceCount(Long relatedEntranceCount) {
            this.relatedEntranceCount = relatedEntranceCount;
            return this;
        }
        public Long getRelatedEntranceCount() {
            return this.relatedEntranceCount;
        }

        public ListClriskDataNodesResponseBodyDataNodeInfos setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskProductScenesResponseBody extends TeaModel {
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

    @NameInMap("SceneInfos")
    public java.util.List<ListClriskProductScenesResponseBodySceneInfos> sceneInfos;

    public static ListClriskProductScenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskProductScenesResponseBody self = new ListClriskProductScenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskProductScenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskProductScenesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskProductScenesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskProductScenesResponseBody setPageCount(Long pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Long getPageCount() {
        return this.pageCount;
    }

    public ListClriskProductScenesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListClriskProductScenesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListClriskProductScenesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListClriskProductScenesResponseBody setSceneInfos(java.util.List<ListClriskProductScenesResponseBodySceneInfos> sceneInfos) {
        this.sceneInfos = sceneInfos;
        return this;
    }
    public java.util.List<ListClriskProductScenesResponseBodySceneInfos> getSceneInfos() {
        return this.sceneInfos;
    }

    public static class ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("RelatedNodeCount")
        public Long relatedNodeCount;

        public static ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos self = new ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos setRelatedNodeCount(Long relatedNodeCount) {
            this.relatedNodeCount = relatedNodeCount;
            return this;
        }
        public Long getRelatedNodeCount() {
            return this.relatedNodeCount;
        }

    }

    public static class ListClriskProductScenesResponseBodySceneInfosSonSceneInfos extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("RelatedNodeCount")
        public Long relatedNodeCount;

        @NameInMap("LeafSceneInfos")
        public java.util.List<ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos> leafSceneInfos;

        public static ListClriskProductScenesResponseBodySceneInfosSonSceneInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskProductScenesResponseBodySceneInfosSonSceneInfos self = new ListClriskProductScenesResponseBodySceneInfosSonSceneInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setRelatedNodeCount(Long relatedNodeCount) {
            this.relatedNodeCount = relatedNodeCount;
            return this;
        }
        public Long getRelatedNodeCount() {
            return this.relatedNodeCount;
        }

        public ListClriskProductScenesResponseBodySceneInfosSonSceneInfos setLeafSceneInfos(java.util.List<ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos> leafSceneInfos) {
            this.leafSceneInfos = leafSceneInfos;
            return this;
        }
        public java.util.List<ListClriskProductScenesResponseBodySceneInfosSonSceneInfosLeafSceneInfos> getLeafSceneInfos() {
            return this.leafSceneInfos;
        }

    }

    public static class ListClriskProductScenesResponseBodySceneInfos extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        @NameInMap("RelatedNodeCount")
        public Long relatedNodeCount;

        @NameInMap("SonSceneInfos")
        public java.util.List<ListClriskProductScenesResponseBodySceneInfosSonSceneInfos> sonSceneInfos;

        public static ListClriskProductScenesResponseBodySceneInfos build(java.util.Map<String, ?> map) throws Exception {
            ListClriskProductScenesResponseBodySceneInfos self = new ListClriskProductScenesResponseBodySceneInfos();
            return TeaModel.build(map, self);
        }

        public ListClriskProductScenesResponseBodySceneInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListClriskProductScenesResponseBodySceneInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListClriskProductScenesResponseBodySceneInfos setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListClriskProductScenesResponseBodySceneInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClriskProductScenesResponseBodySceneInfos setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public ListClriskProductScenesResponseBodySceneInfos setRelatedNodeCount(Long relatedNodeCount) {
            this.relatedNodeCount = relatedNodeCount;
            return this;
        }
        public Long getRelatedNodeCount() {
            return this.relatedNodeCount;
        }

        public ListClriskProductScenesResponseBodySceneInfos setSonSceneInfos(java.util.List<ListClriskProductScenesResponseBodySceneInfosSonSceneInfos> sonSceneInfos) {
            this.sonSceneInfos = sonSceneInfos;
            return this;
        }
        public java.util.List<ListClriskProductScenesResponseBodySceneInfosSonSceneInfos> getSonSceneInfos() {
            return this.sonSceneInfos;
        }

    }

}

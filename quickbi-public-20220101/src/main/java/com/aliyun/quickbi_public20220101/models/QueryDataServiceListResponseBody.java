// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataServiceListResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>78C1AA2D-9201-599E-A0BA-6FC462E57A95</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return result.</p>
     */
    @NameInMap("Result")
    public QueryDataServiceListResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Value range:</p>
     * <ul>
     * <li>true: The request was successful </li>
     * <li>false: The request failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDataServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataServiceListResponseBody self = new QueryDataServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataServiceListResponseBody setResult(QueryDataServiceListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDataServiceListResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDataServiceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDataServiceListResponseBodyResultDataContentFilter extends TeaModel {
        /**
         * <p>Combined conditions.</p>
         */
        @NameInMap("Filters")
        public java.util.List<java.util.Map<String, ?>> filters;

        /**
         * <p>Logical relationship between multiple SQL text keywords.</p>
         * <ul>
         * <li><strong>or</strong>: or</li>
         * <li><strong>and</strong>: and</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("LogicalOperator")
        public String logicalOperator;

        /**
         * <p>Type.</p>
         * <ul>
         * <li>basic: basic</li>
         * <li>combined: complex</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryDataServiceListResponseBodyResultDataContentFilter build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceListResponseBodyResultDataContentFilter self = new QueryDataServiceListResponseBodyResultDataContentFilter();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceListResponseBodyResultDataContentFilter setFilters(java.util.List<java.util.Map<String, ?>> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getFilters() {
            return this.filters;
        }

        public QueryDataServiceListResponseBodyResultDataContentFilter setLogicalOperator(String logicalOperator) {
            this.logicalOperator = logicalOperator;
            return this;
        }
        public String getLogicalOperator() {
            return this.logicalOperator;
        }

        public QueryDataServiceListResponseBodyResultDataContentFilter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDataServiceListResponseBodyResultDataContentReturnFieldsField extends TeaModel {
        /**
         * <p>Display name in the cube model (can be in Chinese or English).</p>
         * 
         * <strong>example:</strong>
         * <p>date(year)</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The corresponding physical field name.</p>
         * 
         * <strong>example:</strong>
         * <p>shid_star</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>Data type.</p>
         * <ul>
         * <li>number: numeric</li>
         * <li>string: string</li>
         * <li>date: date</li>
         * <li>datetime: datetime</li>
         * <li>time: time</li>
         * <li>geographic: geographic</li>
         * <li>boolean: boolean</li>
         * <li>url: URL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>datetime</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>Unique identifier for the original field.</p>
         * 
         * <strong>example:</strong>
         * <p>1c1f88cb7d</p>
         */
        @NameInMap("Fid")
        public String fid;

        /**
         * <p>This attribute is included for date and geographic dimensions, indicating the supported granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>yearRegion</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>Unique name of the cube field, mainly used for unique positioning in the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>sss</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Type.</p>
         * <ul>
         * <li>Dimension: Dimension</li>
         * <li>Measure: Measure</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dimension</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryDataServiceListResponseBodyResultDataContentReturnFieldsField build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceListResponseBodyResultDataContentReturnFieldsField self = new QueryDataServiceListResponseBodyResultDataContentReturnFieldsField();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setFid(String fid) {
            this.fid = fid;
            return this;
        }
        public String getFid() {
            return this.fid;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDataServiceListResponseBodyResultDataContentReturnFields extends TeaModel {
        /**
         * <p>Aggregation operator. For example, SUM, AVG, and MAX.</p>
         * 
         * <strong>example:</strong>
         * <p>SUM</p>
         */
        @NameInMap("Aggregator")
        public String aggregator;

        /**
         * <p>Field parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>s_number</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Remark for the returned field.</p>
         * 
         * <strong>example:</strong>
         * <p>Theme Configuration already exists</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Corresponding cube field information.</p>
         */
        @NameInMap("Field")
        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField field;

        /**
         * <p>Sorting.</p>
         * <ul>
         * <li>asc: Ascending</li>
         * <li>desc: Descending</li>
         * <li>no: No sorting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("Orderby")
        public String orderby;

        public static QueryDataServiceListResponseBodyResultDataContentReturnFields build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceListResponseBodyResultDataContentReturnFields self = new QueryDataServiceListResponseBodyResultDataContentReturnFields();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFields setAggregator(String aggregator) {
            this.aggregator = aggregator;
            return this;
        }
        public String getAggregator() {
            return this.aggregator;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFields setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFields setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFields setField(QueryDataServiceListResponseBodyResultDataContentReturnFieldsField field) {
            this.field = field;
            return this;
        }
        public QueryDataServiceListResponseBodyResultDataContentReturnFieldsField getField() {
            return this.field;
        }

        public QueryDataServiceListResponseBodyResultDataContentReturnFields setOrderby(String orderby) {
            this.orderby = orderby;
            return this;
        }
        public String getOrderby() {
            return this.orderby;
        }

    }

    public static class QueryDataServiceListResponseBodyResultDataContent extends TeaModel {
        /**
         * <p>Cube identifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>56f9f34a-bdba-496a-91a3-a18b1ff73a80</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <p>Dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test data source</p>
         */
        @NameInMap("CubeName")
        public String cubeName;

        /**
         * <p>Detail or Summary</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Detail")
        public Boolean detail;

        /**
         * <p>Request parameter information.</p>
         */
        @NameInMap("Filter")
        public QueryDataServiceListResponseBodyResultDataContentFilter filter;

        /**
         * <p>Return information.</p>
         */
        @NameInMap("ReturnFields")
        public java.util.List<QueryDataServiceListResponseBodyResultDataContentReturnFields> returnFields;

        public static QueryDataServiceListResponseBodyResultDataContent build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceListResponseBodyResultDataContent self = new QueryDataServiceListResponseBodyResultDataContent();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceListResponseBodyResultDataContent setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public QueryDataServiceListResponseBodyResultDataContent setCubeName(String cubeName) {
            this.cubeName = cubeName;
            return this;
        }
        public String getCubeName() {
            return this.cubeName;
        }

        public QueryDataServiceListResponseBodyResultDataContent setDetail(Boolean detail) {
            this.detail = detail;
            return this;
        }
        public Boolean getDetail() {
            return this.detail;
        }

        public QueryDataServiceListResponseBodyResultDataContent setFilter(QueryDataServiceListResponseBodyResultDataContentFilter filter) {
            this.filter = filter;
            return this;
        }
        public QueryDataServiceListResponseBodyResultDataContentFilter getFilter() {
            return this.filter;
        }

        public QueryDataServiceListResponseBodyResultDataContent setReturnFields(java.util.List<QueryDataServiceListResponseBodyResultDataContentReturnFields> returnFields) {
            this.returnFields = returnFields;
            return this;
        }
        public java.util.List<QueryDataServiceListResponseBodyResultDataContentReturnFields> getReturnFields() {
            return this.returnFields;
        }

    }

    public static class QueryDataServiceListResponseBodyResultData extends TeaModel {
        /**
         * <p>The model of the data service in JSON format.</p>
         */
        @NameInMap("Content")
        public QueryDataServiceListResponseBodyResultDataContent content;

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7cb94cd48701</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>Creator\&quot;s name.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>Cube identifier ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d14e7448-0eb3-40d3-9375-4afef8de29fd</p>
         */
        @NameInMap("CubeId")
        public String cubeId;

        /**
         * <p>Dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test data source</p>
         */
        @NameInMap("CubeName")
        public String cubeName;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-18 14:00:02.0</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-21 18:02:36</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Modifier\&quot;s userId.</p>
         * 
         * <strong>example:</strong>
         * <p>7cb94cd48701</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p>Modifier\&quot;s name</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("ModifierName")
        public String modifierName;

        /**
         * <p>Data service name.</p>
         * 
         * <strong>example:</strong>
         * <p>test report</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Owner ID</p>
         * 
         * <strong>example:</strong>
         * <p>862801339</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>Owner\&quot;s name</p>
         * 
         * <strong>example:</strong>
         * <p>lisi</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>Unique ID of the data service.</p>
         * 
         * <strong>example:</strong>
         * <p>dtsuq3i31f5j8v848b</p>
         */
        @NameInMap("Sid")
        public String sid;

        /**
         * <p>Workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7350a155-0e94-4c6c-8620-57bbec38****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        /**
         * <p>Workspace name.</p>
         * 
         * <strong>example:</strong>
         * <p>test workspace</p>
         */
        @NameInMap("WorkspaceName")
        public String workspaceName;

        public static QueryDataServiceListResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceListResponseBodyResultData self = new QueryDataServiceListResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceListResponseBodyResultData setContent(QueryDataServiceListResponseBodyResultDataContent content) {
            this.content = content;
            return this;
        }
        public QueryDataServiceListResponseBodyResultDataContent getContent() {
            return this.content;
        }

        public QueryDataServiceListResponseBodyResultData setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public QueryDataServiceListResponseBodyResultData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public QueryDataServiceListResponseBodyResultData setCubeId(String cubeId) {
            this.cubeId = cubeId;
            return this;
        }
        public String getCubeId() {
            return this.cubeId;
        }

        public QueryDataServiceListResponseBodyResultData setCubeName(String cubeName) {
            this.cubeName = cubeName;
            return this;
        }
        public String getCubeName() {
            return this.cubeName;
        }

        public QueryDataServiceListResponseBodyResultData setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryDataServiceListResponseBodyResultData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryDataServiceListResponseBodyResultData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryDataServiceListResponseBodyResultData setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public QueryDataServiceListResponseBodyResultData setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public QueryDataServiceListResponseBodyResultData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDataServiceListResponseBodyResultData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public QueryDataServiceListResponseBodyResultData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public QueryDataServiceListResponseBodyResultData setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public QueryDataServiceListResponseBodyResultData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public QueryDataServiceListResponseBodyResultData setWorkspaceName(String workspaceName) {
            this.workspaceName = workspaceName;
            return this;
        }
        public String getWorkspaceName() {
            return this.workspaceName;
        }

    }

    public static class QueryDataServiceListResponseBodyResult extends TeaModel {
        /**
         * <p>Data service information.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryDataServiceListResponseBodyResultData> data;

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>Number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryDataServiceListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDataServiceListResponseBodyResult self = new QueryDataServiceListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDataServiceListResponseBodyResult setData(java.util.List<QueryDataServiceListResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryDataServiceListResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryDataServiceListResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryDataServiceListResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryDataServiceListResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryDataServiceListResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}

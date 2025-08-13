// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CompareCopyRuleVariableResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object.</p>
     */
    @NameInMap("ResultObject")
    public CompareCopyRuleVariableResponseBodyResultObject resultObject;

    public static CompareCopyRuleVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareCopyRuleVariableResponseBody self = new CompareCopyRuleVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareCopyRuleVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareCopyRuleVariableResponseBody setResultObject(CompareCopyRuleVariableResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CompareCopyRuleVariableResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CompareCopyRuleVariableResponseBodyResultObjectCustVariableList extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable ID</p>
         * 
         * <strong>example:</strong>
         * <p>1483</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>dxkkLw8fe18</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_VELOCITY</p>
         */
        @NameInMap("OutType")
        public String outType;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>近1天账户登录设备数_bk4</p>
         */
        @NameInMap("Title")
        public String title;

        public static CompareCopyRuleVariableResponseBodyResultObjectCustVariableList build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObjectCustVariableList self = new CompareCopyRuleVariableResponseBodyResultObjectCustVariableList();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObjectCustVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectCustVariableList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectCustVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectCustVariableList setOutType(String outType) {
            this.outType = outType;
            return this;
        }
        public String getOutType() {
            return this.outType;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectCustVariableList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CompareCopyRuleVariableResponseBodyResultObjectEventVariableList extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable id</p>
         * 
         * <strong>example:</strong>
         * <p>375</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("OutType")
        public String outType;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>年龄</p>
         */
        @NameInMap("Title")
        public String title;

        public static CompareCopyRuleVariableResponseBodyResultObjectEventVariableList build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObjectEventVariableList self = new CompareCopyRuleVariableResponseBodyResultObjectEventVariableList();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObjectEventVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectEventVariableList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectEventVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectEventVariableList setOutType(String outType) {
            this.outType = outType;
            return this;
        }
        public String getOutType() {
            return this.outType;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectEventVariableList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable ID</p>
         * 
         * <strong>example:</strong>
         * <p>2540</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>ex_XheC9A382fe7</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Variable Type</p>
         * 
         * <strong>example:</strong>
         * <p>EXPRESSION</p>
         */
        @NameInMap("OutType")
        public String outType;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>手机号前7位</p>
         */
        @NameInMap("Title")
        public String title;

        public static CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList self = new CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList setOutType(String outType) {
            this.outType = outType;
            return this;
        }
        public String getOutType() {
            return this.outType;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable id</p>
         * 
         * <strong>example:</strong>
         * <p>1987</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>nl_UN8otElLb490</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>NAME_LIST</p>
         */
        @NameInMap("OutType")
        public String outType;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        @NameInMap("Title")
        public String title;

        public static CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList self = new CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList setOutType(String outType) {
            this.outType = outType;
            return this;
        }
        public String getOutType() {
            return this.outType;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable ID</p>
         * 
         * <strong>example:</strong>
         * <p>217</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Variable Name</p>
         * 
         * <strong>example:</strong>
         * <p>ex_vcaoii1697</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Variable Type</p>
         * 
         * <strong>example:</strong>
         * <p>QUERY_EXPRESSION</p>
         */
        @NameInMap("OutType")
        public String outType;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>获取年龄</p>
         */
        @NameInMap("Title")
        public String title;

        public static CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList self = new CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList setOutType(String outType) {
            this.outType = outType;
            return this;
        }
        public String getOutType() {
            return this.outType;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList extends TeaModel {
        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable ID</p>
         * 
         * <strong>example:</strong>
         * <p>1003</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>sl_S02sHLFT7818</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Variable type</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_BIND</p>
         */
        @NameInMap("OutType")
        public String outType;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>根据ip地址得到评分</p>
         */
        @NameInMap("Title")
        public String title;

        public static CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList self = new CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList setOutType(String outType) {
            this.outType = outType;
            return this;
        }
        public String getOutType() {
            return this.outType;
        }

        public CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CompareCopyRuleVariableResponseBodyResultObject extends TeaModel {
        /**
         * <p>Cumulative variable list</p>
         */
        @NameInMap("CustVariableList")
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectCustVariableList> custVariableList;

        /**
         * <p>Event field variables</p>
         */
        @NameInMap("EventVariableList")
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectEventVariableList> eventVariableList;

        /**
         * <p>Custom variable list</p>
         */
        @NameInMap("ExpressionVariableList")
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList> expressionVariableList;

        /**
         * <p>Name list variables</p>
         */
        @NameInMap("NameListVariableList")
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList> nameListVariableList;

        /**
         * <p>Custom Query Variable List</p>
         */
        @NameInMap("QueryExpressionVariableList")
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList> queryExpressionVariableList;

        /**
         * <p>System variable list</p>
         */
        @NameInMap("SystemVariableList")
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList> systemVariableList;

        public static CompareCopyRuleVariableResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CompareCopyRuleVariableResponseBodyResultObject self = new CompareCopyRuleVariableResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CompareCopyRuleVariableResponseBodyResultObject setCustVariableList(java.util.List<CompareCopyRuleVariableResponseBodyResultObjectCustVariableList> custVariableList) {
            this.custVariableList = custVariableList;
            return this;
        }
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectCustVariableList> getCustVariableList() {
            return this.custVariableList;
        }

        public CompareCopyRuleVariableResponseBodyResultObject setEventVariableList(java.util.List<CompareCopyRuleVariableResponseBodyResultObjectEventVariableList> eventVariableList) {
            this.eventVariableList = eventVariableList;
            return this;
        }
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectEventVariableList> getEventVariableList() {
            return this.eventVariableList;
        }

        public CompareCopyRuleVariableResponseBodyResultObject setExpressionVariableList(java.util.List<CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList> expressionVariableList) {
            this.expressionVariableList = expressionVariableList;
            return this;
        }
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectExpressionVariableList> getExpressionVariableList() {
            return this.expressionVariableList;
        }

        public CompareCopyRuleVariableResponseBodyResultObject setNameListVariableList(java.util.List<CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList> nameListVariableList) {
            this.nameListVariableList = nameListVariableList;
            return this;
        }
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectNameListVariableList> getNameListVariableList() {
            return this.nameListVariableList;
        }

        public CompareCopyRuleVariableResponseBodyResultObject setQueryExpressionVariableList(java.util.List<CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList> queryExpressionVariableList) {
            this.queryExpressionVariableList = queryExpressionVariableList;
            return this;
        }
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectQueryExpressionVariableList> getQueryExpressionVariableList() {
            return this.queryExpressionVariableList;
        }

        public CompareCopyRuleVariableResponseBodyResultObject setSystemVariableList(java.util.List<CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList> systemVariableList) {
            this.systemVariableList = systemVariableList;
            return this;
        }
        public java.util.List<CompareCopyRuleVariableResponseBodyResultObjectSystemVariableList> getSystemVariableList() {
            return this.systemVariableList;
        }

    }

}

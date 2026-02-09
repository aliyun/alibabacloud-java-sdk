// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListCategoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListCategoriesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CA6204AC-6AA9-4CFA-9310-7DFD20C19EBC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesResponseBody self = new ListCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCategoriesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCategoriesResponseBody setData(ListCategoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCategoriesResponseBodyData getData() {
        return this.data;
    }

    public ListCategoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCategoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCategoriesResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>793</p>
         */
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        public static ListCategoriesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCategoriesResponseBodyDataList self = new ListCategoriesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCategoriesResponseBodyDataList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListCategoriesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListCategoriesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCategoriesResponseBodyDataList> list;

        public static ListCategoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCategoriesResponseBodyData self = new ListCategoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCategoriesResponseBodyData setList(java.util.List<ListCategoriesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCategoriesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}

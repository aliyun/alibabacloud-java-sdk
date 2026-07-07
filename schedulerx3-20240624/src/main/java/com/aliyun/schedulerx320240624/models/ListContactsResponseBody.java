// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListContactsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListContactsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter check error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5EF879D0-3B43-5AD1-9BF7-52418F9C5E73</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListContactsResponseBody self = new ListContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListContactsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListContactsResponseBody setData(ListContactsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListContactsResponseBodyData getData() {
        return this.data;
    }

    public ListContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListContactsResponseBodyDataRecords extends TeaModel {
        /**
         * <p>渠道配置 JSON（clientSecret 已脱敏为 ***）</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;channels&quot;:[{&quot;channelType&quot;:&quot;dingtalk&quot;,&quot;clientId&quot;:&quot;xxx&quot;,&quot;clientSecret&quot;:&quot;xxx&quot;,&quot;targetType&quot;:&quot;group&quot;,&quot;targetId&quot;:&quot;xxx&quot;,&quot;robotCode&quot;:&quot;xxx&quot;}]}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>联系人 ID</p>
         * 
         * <strong>example:</strong>
         * <p>job-85d64bff-50b5-4d02-aa3f-19956b17449d</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>联系人名称</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>是否启用</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1783065190000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>最后修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>1783065190000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>渠道大类（IM/WEBHOOK/SMS/MAIL）</p>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListContactsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListContactsResponseBodyDataRecords self = new ListContactsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListContactsResponseBodyDataRecords setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListContactsResponseBodyDataRecords setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ListContactsResponseBodyDataRecords setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ListContactsResponseBodyDataRecords setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListContactsResponseBodyDataRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListContactsResponseBodyDataRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListContactsResponseBodyDataRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListContactsResponseBodyData extends TeaModel {
        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>每页条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>联系人列表</p>
         */
        @NameInMap("Records")
        public java.util.List<ListContactsResponseBodyDataRecords> records;

        /**
         * <p>总记录数</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListContactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListContactsResponseBodyData self = new ListContactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListContactsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListContactsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListContactsResponseBodyData setRecords(java.util.List<ListContactsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListContactsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListContactsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}

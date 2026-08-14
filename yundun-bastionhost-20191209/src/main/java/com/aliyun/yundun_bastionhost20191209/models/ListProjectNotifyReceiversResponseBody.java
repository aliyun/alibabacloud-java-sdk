// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListProjectNotifyReceiversResponseBody extends TeaModel {
    /**
     * <p>The list of recipients.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListProjectNotifyReceiversResponseBodyItems> items;

    /**
     * <p>The value of the MaxResults request parameter passed in the request if a valid parameter value was specified. Otherwise, the default value is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next request. Use this value for the NextToken request parameter in the next paged query. If this field is empty in the response, no more data is available. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>4ieSWJCwxvW3dk3wF.BqkrZmP72nWu5zJ5NWydMqyEs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81500666-d7f5-4143-8329-0223cc738105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of recipients returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListProjectNotifyReceiversResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectNotifyReceiversResponseBody self = new ListProjectNotifyReceiversResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectNotifyReceiversResponseBody setItems(java.util.List<ListProjectNotifyReceiversResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListProjectNotifyReceiversResponseBodyItems> getItems() {
        return this.items;
    }

    public ListProjectNotifyReceiversResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectNotifyReceiversResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectNotifyReceiversResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectNotifyReceiversResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectNotifyReceiversResponseBodyItems extends TeaModel {
        /**
         * <p>The email address of the recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>6291****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The name of the recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The phone number of the recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>131****6412</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>The ID of the notification recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        public static ListProjectNotifyReceiversResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListProjectNotifyReceiversResponseBodyItems self = new ListProjectNotifyReceiversResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListProjectNotifyReceiversResponseBodyItems setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListProjectNotifyReceiversResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectNotifyReceiversResponseBodyItems setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public ListProjectNotifyReceiversResponseBodyItems setReceiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }
        public String getReceiverId() {
            return this.receiverId;
        }

    }

}

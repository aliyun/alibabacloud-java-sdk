// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTopicsRequest extends TeaModel {
    /**
     * <p>The condition that you want to use to filter topics in the instance. If you leave this parameter empty, all topics in the instance are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>topic_test</p>
     */
    @NameInMap("filter")
    public String filter;

    /**
     * <p>The message types of the topics.</p>
     */
    @NameInMap("messageTypes")
    public java.util.List<String> messageTypes;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTopicsRequest self = new ListTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListTopicsRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }
    public String getFilter() {
        return this.filter;
    }

    public ListTopicsRequest setMessageTypes(java.util.List<String> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }
    public java.util.List<String> getMessageTypes() {
        return this.messageTypes;
    }

    public ListTopicsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTopicsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

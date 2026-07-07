// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListContactsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Tom</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>页码，从 1 开始，默认 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>每页条数，默认 20，最大 100</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactsRequest self = new ListContactsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactsRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ListContactsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListContactsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

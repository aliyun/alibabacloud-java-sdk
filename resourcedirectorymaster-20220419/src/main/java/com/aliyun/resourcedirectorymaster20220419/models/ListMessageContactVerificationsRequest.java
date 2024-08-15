// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactVerificationsRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>c-qL4HqKONzOM7****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListMessageContactVerificationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageContactVerificationsRequest self = new ListMessageContactVerificationsRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageContactVerificationsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListMessageContactVerificationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessageContactVerificationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

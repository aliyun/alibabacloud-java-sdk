// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class ListMessageContactsRequest extends TeaModel {
    /**
     * <p>The ID of the contact.</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The ID of the object to which the contact is bound. Valid values:</p>
     * <br>
     * <p>*   ID of the resource directory</p>
     * <p>*   ID of the folder</p>
     * <p>*   ID of the member</p>
     */
    @NameInMap("Member")
    public String member;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListMessageContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageContactsRequest self = new ListMessageContactsRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageContactsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListMessageContactsRequest setMember(String member) {
        this.member = member;
        return this;
    }
    public String getMember() {
        return this.member;
    }

    public ListMessageContactsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessageContactsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

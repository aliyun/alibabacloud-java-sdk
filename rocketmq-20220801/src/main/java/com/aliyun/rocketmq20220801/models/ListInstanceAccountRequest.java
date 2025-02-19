// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListInstanceAccountRequest extends TeaModel {
    /**
     * <p>The status of the account.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DISABLE</li>
     * <li>ENABLE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("accountStatus")
    public String accountStatus;

    /**
     * <p>The account type.</p>
     * <ul>
     * <li>CUSTOMER</li>
     * <li>DEFAULT</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CUSTOMER</p>
     */
    @NameInMap("accountType")
    public String accountType;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The username of the account.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("username")
    public String username;

    public static ListInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAccountRequest self = new ListInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceAccountRequest setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public ListInstanceAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ListInstanceAccountRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceAccountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstanceAccountRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}

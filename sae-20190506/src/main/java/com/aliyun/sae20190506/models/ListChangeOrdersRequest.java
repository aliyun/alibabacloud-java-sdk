// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListChangeOrdersRequest extends TeaModel {
    /**
     * <p>145341c-9708-4967-b3ec-24933767\*\*\*\*</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>2</p>
     */
    @NameInMap("CoStatus")
    public String coStatus;

    /**
     * <p>CoCreateApp</p>
     */
    @NameInMap("CoType")
    public String coType;

    /**
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>test</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListChangeOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChangeOrdersRequest self = new ListChangeOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListChangeOrdersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListChangeOrdersRequest setCoStatus(String coStatus) {
        this.coStatus = coStatus;
        return this;
    }
    public String getCoStatus() {
        return this.coStatus;
    }

    public ListChangeOrdersRequest setCoType(String coType) {
        this.coType = coType;
        return this;
    }
    public String getCoType() {
        return this.coType;
    }

    public ListChangeOrdersRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListChangeOrdersRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListChangeOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

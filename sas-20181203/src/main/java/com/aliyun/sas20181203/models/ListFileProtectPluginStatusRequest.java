// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectPluginStatusRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the core file monitoring rule.</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    public static ListFileProtectPluginStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectPluginStatusRequest self = new ListFileProtectPluginStatusRequest();
        return TeaModel.build(map, self);
    }

    public ListFileProtectPluginStatusRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListFileProtectPluginStatusRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListFileProtectPluginStatusRequest setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

}

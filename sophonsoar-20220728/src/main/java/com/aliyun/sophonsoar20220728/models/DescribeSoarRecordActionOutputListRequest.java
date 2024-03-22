// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordActionOutputListRequest extends TeaModel {
    /**
     * <p>The UUID of the component action.</p>
     * <br>
     * <p>>  You can call the [DescribeSoarTaskAndActions](~~DescribeSoarTaskAndActions~~) operation to query the UUID.</p>
     */
    @NameInMap("ActionUuid")
    public String actionUuid;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. Default value: 1. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. If you leave this parameter empty, 10 entries are returned on each page.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSoarRecordActionOutputListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordActionOutputListRequest self = new DescribeSoarRecordActionOutputListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordActionOutputListRequest setActionUuid(String actionUuid) {
        this.actionUuid = actionUuid;
        return this;
    }
    public String getActionUuid() {
        return this.actionUuid;
    }

    public DescribeSoarRecordActionOutputListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSoarRecordActionOutputListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarRecordActionOutputListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}

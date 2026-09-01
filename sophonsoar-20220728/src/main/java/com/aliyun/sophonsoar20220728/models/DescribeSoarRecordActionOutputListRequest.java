// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordActionOutputListRequest extends TeaModel {
    /**
     * <p>The UUID of the component action.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSoarTaskAndActions~~">DescribeSoarTaskAndActions</a> operation to get this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2202c90d-fa93-4726-bc32-xxxxxx</p>
     */
    @NameInMap("ActionUuid")
    public String actionUuid;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number of the results to return. Default value: 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 10 entries are returned.</p>
     * <blockquote>
     * <p>We recommend that you specify a value for this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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

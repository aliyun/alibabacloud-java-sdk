// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarTaskAndActionsRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
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
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 20. If you do not specify this parameter, 10 entries are returned.</p>
     * <blockquote>
     * <p>Specify a value for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The trigger type of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>stream</strong>: The task is triggered by a data stream.</p>
     * </li>
     * <li><p><strong>debug</strong>: The task is triggered by a debugging process.</p>
     * </li>
     * <li><p><strong>manual</strong>: The task is triggered manually.</p>
     * </li>
     * <li><p><strong>timer</strong>: The task is triggered by a timer.</p>
     * </li>
     * <li><p><strong>SubInvoke</strong>: The task is triggered by a child flow.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>debug</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The input parameter of the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>input</p>
     */
    @NameInMap("QueryValue")
    public String queryValue;

    /**
     * <p>The UUID of the playbook task.</p>
     * 
     * <strong>example:</strong>
     * <p>1077f2f9-25e8-42d9-bfdf-1528e1313f6d</p>
     */
    @NameInMap("RequestUuid")
    public String requestUuid;

    public static DescribeSoarTaskAndActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarTaskAndActionsRequest self = new DescribeSoarTaskAndActionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarTaskAndActionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSoarTaskAndActionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSoarTaskAndActionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSoarTaskAndActionsRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public DescribeSoarTaskAndActionsRequest setQueryValue(String queryValue) {
        this.queryValue = queryValue;
        return this;
    }
    public String getQueryValue() {
        return this.queryValue;
    }

    public DescribeSoarTaskAndActionsRequest setRequestUuid(String requestUuid) {
        this.requestUuid = requestUuid;
        return this;
    }
    public String getRequestUuid() {
        return this.requestUuid;
    }

}

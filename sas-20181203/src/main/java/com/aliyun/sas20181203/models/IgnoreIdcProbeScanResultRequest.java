// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreIdcProbeScanResultRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: adds the scan result to the whitelist.</li>
     * <li><strong>2</strong>: ignores the scan result.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IgnoreAction")
    public Integer ignoreAction;

    /**
     * <p>The ID of the scan result. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeIdcProbeScanResultList~~">DescribeIdcProbeScanResultList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>332098932,332098964,332098963</p>
     */
    @NameInMap("ScanResultIds")
    public String scanResultIds;

    public static IgnoreIdcProbeScanResultRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreIdcProbeScanResultRequest self = new IgnoreIdcProbeScanResultRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreIdcProbeScanResultRequest setIgnoreAction(Integer ignoreAction) {
        this.ignoreAction = ignoreAction;
        return this;
    }
    public Integer getIgnoreAction() {
        return this.ignoreAction;
    }

    public IgnoreIdcProbeScanResultRequest setScanResultIds(String scanResultIds) {
        this.scanResultIds = scanResultIds;
        return this;
    }
    public String getScanResultIds() {
        return this.scanResultIds;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshOssBucketScanInfoRequest extends TeaModel {
    /**
     * <p>The service source. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS</li>
     * <li><strong>NAS</strong>: NAS</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("Source")
    public String source;

    public static RefreshOssBucketScanInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshOssBucketScanInfoRequest self = new RefreshOssBucketScanInfoRequest();
        return TeaModel.build(map, self);
    }

    public RefreshOssBucketScanInfoRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ScanFileResponseBody extends TeaModel {
    /**
     * <p>List of files</p>
     */
    @NameInMap("items")
    public java.util.List<File> items;

    /**
     * <p>Identifier of the first resource on the next page. This value is empty on the last page.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_marker")
    public String nextMarker;

    public static ScanFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanFileResponseBody self = new ScanFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanFileResponseBody setItems(java.util.List<File> items) {
        this.items = items;
        return this;
    }
    public java.util.List<File> getItems() {
        return this.items;
    }

    public ScanFileResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

}

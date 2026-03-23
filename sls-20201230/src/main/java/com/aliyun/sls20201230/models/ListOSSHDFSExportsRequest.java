// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSHDFSExportsRequest extends TeaModel {
    /**
     * <p>The name of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The line from which to start the query. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries to return. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Integer size;

    public static ListOSSHDFSExportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOSSHDFSExportsRequest self = new ListOSSHDFSExportsRequest();
        return TeaModel.build(map, self);
    }

    public ListOSSHDFSExportsRequest setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public ListOSSHDFSExportsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListOSSHDFSExportsRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}

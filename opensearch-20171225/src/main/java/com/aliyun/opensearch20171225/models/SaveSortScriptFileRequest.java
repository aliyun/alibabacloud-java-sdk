// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SaveSortScriptFileRequest extends TeaModel {
    /**
     * <p>The script content that is encoded in the Base64 format.</p>
     * 
     * <strong>example:</strong>
     * <p>4769#0: *28194492991 a client request body is buffered to a temporary file /usr/local/webserver/openresty/nginx/client_body_temp/0000624474,</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The version number of the script content.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-01</p>
     */
    @NameInMap("version")
    public Integer version;

    public static SaveSortScriptFileRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSortScriptFileRequest self = new SaveSortScriptFileRequest();
        return TeaModel.build(map, self);
    }

    public SaveSortScriptFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveSortScriptFileRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}

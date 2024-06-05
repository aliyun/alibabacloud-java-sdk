// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BatchRequest extends TeaModel {
    /**
     * <p>The child requests.</p>
     * <br>
     * <p>The number of child requests. Valid value: 1 to 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("requests")
    public java.util.List<BatchRequestRequests> requests;

    /**
     * <p>The type of the resource that you want to manage. Valid values:</p>
     * <br>
     * <p>*   file: a file.</p>
     * <p>*   drive: an individual drive or a team drive.</p>
     * <p>*   user: a user.</p>
     * <p>*   group: a group.</p>
     * <p>*   membership: a group member.</p>
     * <p>*   share_link: a share.</p>
     * <p>*   async_task: an asynchronous task.</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("resource")
    public String resource;

    public static BatchRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRequest self = new BatchRequest();
        return TeaModel.build(map, self);
    }

    public BatchRequest setRequests(java.util.List<BatchRequestRequests> requests) {
        this.requests = requests;
        return this;
    }
    public java.util.List<BatchRequestRequests> getRequests() {
        return this.requests;
    }

    public BatchRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public static class BatchRequestRequests extends TeaModel {
        /**
         * <p>The request parameters of a child request. The parameter value must be a JSON string. For more information, see the topic of the corresponding child request.</p>
         * <br>
         * <p>Before you specify the request body, you must specify a header by using Content-Type. Content-Type can only be set to application/json.</p>
         */
        @NameInMap("body")
        public java.util.Map<String, ?> body;

        /**
         * <p>The header of a child request, which indicates the type of the data specified in the request body.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The ID of the child request. The ID is used to associate a child request with a response. The ID of a child request must be unique.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The method of a child request. Valid values:</p>
         * <br>
         * <p>*   POST</p>
         * <p>*   GET</p>
         * <p>*   PUT</p>
         * <p>*   DELETE</p>
         * <p>*   HEAD</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The API path of a child request. Valid values:</p>
         * <br>
         * <p>*   /file/get: queries the information about a file.</p>
         * <p>*   /file/update: modifies the information about a file.</p>
         * <p>*   /file/search: searches for a file.</p>
         * <p>*   /file/copy: copies a file or folder.</p>
         * <p>*   /file/move: moves a file or folder.</p>
         * <p>*   /file/delete: deletes a file or folder.</p>
         * <p>*   /file/get_download_url: queries the download URL of a file.</p>
         * <p>*   /file/get_share_link_download_url: queries the download URL of a file in a share.</p>
         * <p>*   /recyclebin/trash: moves a file or folder to the recycle bin.</p>
         * <p>*   /recyclebin/restore: restores a file or folder.</p>
         * <p>*   /file/put_usertags: adds tags to a user.</p>
         * <p>*   /file/delete_usertags: removes tags from a user.</p>
         * <p>*   /drive/get: queries the information about a drive.</p>
         * <p>*   /user/get: queries the information about a user.</p>
         * <p>*   /group/get: queries the information about a group.</p>
         * <p>*   /share_link/create: creates a share.</p>
         * <p>*   /share_link/update: modifies a share.</p>
         * <p>*   /share_link/cancel: cancels a share.</p>
         * <p>*   /share_link/list: queries shares.</p>
         * <p>*   /share_link/get: queries the information about a share.</p>
         * <p>*   /share_link/get_share_token: queries an access token of a share.</p>
         * <p>*   /async_task/get: queries the information about an asynchronous task.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("url")
        public String url;

        public static BatchRequestRequests build(java.util.Map<String, ?> map) throws Exception {
            BatchRequestRequests self = new BatchRequestRequests();
            return TeaModel.build(map, self);
        }

        public BatchRequestRequests setBody(java.util.Map<String, ?> body) {
            this.body = body;
            return this;
        }
        public java.util.Map<String, ?> getBody() {
            return this.body;
        }

        public BatchRequestRequests setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public BatchRequestRequests setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public BatchRequestRequests setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public BatchRequestRequests setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}

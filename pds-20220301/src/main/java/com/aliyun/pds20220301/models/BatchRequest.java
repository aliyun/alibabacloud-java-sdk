// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class BatchRequest extends TeaModel {
    /**
     * <p>A collection of subrequests.</p>
     * <p>A batch request can contain 1 to 100 subrequests.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("requests")
    public java.util.List<BatchRequestRequests> requests;

    /**
     * <p>The resource type of the subrequests. Supported resource types include:</p>
     * <ul>
     * <li><p><code>file</code>: A file.</p>
     * </li>
     * <li><p><code>drive</code>: A drive.</p>
     * </li>
     * <li><p><code>user</code>: A user.</p>
     * </li>
     * <li><p><code>group</code>: A group.</p>
     * </li>
     * <li><p><code>membership</code>: A group membership.</p>
     * </li>
     * <li><p><code>share_link</code>: A share link.</p>
     * </li>
     * <li><p><code>async_task</code>: An asynchronous task.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>file</p>
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
         * <p>The request body for the subrequest. For details, refer to the documentation for the specific API operation.</p>
         * <p>If you specify the <code>body</code> parameter, you must also set the <code>Content-Type</code> request header to <code>application/json</code>.</p>
         */
        @NameInMap("body")
        public java.util.Map<String, ?> body;

        /**
         * <p>The request headers for the subrequest.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The unique ID of the subrequest. This ID is used to correlate the subrequest with its response. IDs must be unique within a batch request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>93433894994ad2e1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The HTTP method of the subrequest. Supported methods include:</p>
         * <ul>
         * <li><p>POST</p>
         * </li>
         * <li><p>GET</p>
         * </li>
         * <li><p>PUT</p>
         * </li>
         * <li><p>DELETE</p>
         * </li>
         * <li><p>HEAD</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The API path of the subrequest. Supported paths include:</p>
         * <ul>
         * <li><p><code>/file/get</code>: Get file details.</p>
         * </li>
         * <li><p><code>/file/update</code>: Update file information.</p>
         * </li>
         * <li><p><code>/file/search</code>: Search for files.</p>
         * </li>
         * <li><p><code>/file/copy</code>: Copy a file or folder.</p>
         * </li>
         * <li><p><code>/file/move</code>: Move a file or folder.</p>
         * </li>
         * <li><p><code>/file/delete</code>: Delete a file or folder.</p>
         * </li>
         * <li><p><code>/file/get_download_url</code>: Get the download URL for a file.</p>
         * </li>
         * <li><p><code>/file/get_share_link_download_url</code>: Get the download URL from a share link.</p>
         * </li>
         * <li><p><code>/recyclebin/trash</code>: Move a file or folder to the recycle bin.</p>
         * </li>
         * <li><p><code>/recyclebin/restore</code>: Restore a file or folder from the recycle bin.</p>
         * </li>
         * <li><p><code>/file/put_usertags</code>: Set user tags.</p>
         * </li>
         * <li><p><code>/file/delete_usertags</code>: Delete user tags.</p>
         * </li>
         * <li><p><code>/drive/get</code>: Get drive information.</p>
         * </li>
         * <li><p><code>/user/get</code>: Get user information.</p>
         * </li>
         * <li><p><code>/group/get</code>: Get group information.</p>
         * </li>
         * <li><p><code>/share_link/create</code>: Create a share link.</p>
         * </li>
         * <li><p><code>/share_link/update</code>: Update a share link.</p>
         * </li>
         * <li><p><code>/share_link/cancel</code>: Cancel a share link.</p>
         * </li>
         * <li><p><code>/share_link/list</code>: List share links.</p>
         * </li>
         * <li><p><code>/share_link/get</code>: Get share link information.</p>
         * </li>
         * <li><p><code>/share_link/get_share_token</code>: Get a share token.</p>
         * </li>
         * <li><p><code>/async_task/get</code>: Get asynchronous task information.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/file/get</p>
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

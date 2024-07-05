// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to purge resources in a directory if the resources requested are different from the resources on the origin server.</p>
     * <ul>
     * <li><strong>true</strong>: refreshes all resources in the directory. If you set this parameter to true, when the requested content matches the resource in the directory, the POP retrieves the resource from the origin server, returns the resource to the client, and caches the resource.</li>
     * <li><strong>false</strong> (default): refreshes the changed resources in the directory. If you set this parameter to false, when the requested content matches the resource in the directory, the POP obtains the Last-Modified parameter of the resource from the origin server. If the value of the obtained Last-Modified parameter is the same as that of the cached resource, the cached resource is returned. Otherwise, the POP retrieves the resource from the origin server, returns the resource to the client, and caches the resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The URL of the file to be prefetched. Separate multiple URLs with line breaks (\n or \r\n).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com/image/1.png</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of the object that you want to refresh. Valid values:</p>
     * <ul>
     * <li><strong>File</strong> (default): refreshes one or more files.</li>
     * <li><strong>Directory</strong>: refreshes the files in specified directories.</li>
     * <li><strong>Regex</strong>: refreshes content based on regular expressions.</li>
     * <li><strong>IgnoreParams</strong>: removes the question mark (?) and parameters after the question mark (?) in a request URL and refreshes content. After you call this operation with the request URL submitted, the system compares the submitted URL with the URL of the cached resource without specific parameters. If the URLs match, the POPs refresh the cached resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>File</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RefreshVodObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshVodObjectCachesRequest self = new RefreshVodObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshVodObjectCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RefreshVodObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshVodObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshVodObjectCachesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RefreshVodObjectCachesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}

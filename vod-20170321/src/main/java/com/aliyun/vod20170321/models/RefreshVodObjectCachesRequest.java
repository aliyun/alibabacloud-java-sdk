// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesRequest extends TeaModel {
    /**
     * <p>Specifies whether to purge all resources in the corresponding directory when the back-to-origin content is inconsistent with the origin server resources. Default value: false.</p>
     * <ul>
     * <li><strong>true</strong>: purges all resources in the corresponding directory. When &quot;Purge All Resources&quot; is selected, if the requested content matches a resource in the directory, the CDN node fetches the new resource from the origin server, returns it to the user, and re-caches the resource.</li>
     * <li><strong>false</strong>: purges only changed resources in the corresponding directory. When &quot;Purge Changed Resources&quot; is selected, if the requested content matches a resource in the directory, the CDN node retrieves the Last-Modified information of the resource from the origin server. If it matches the currently cached resource, the cached resource is returned directly. If it does not match, the CDN node fetches the new resource from the origin server, returns it to the user, and re-caches the resource.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The URL of the file to prefetch. Separate multiple URLs with line breaks (
     *  or 
     * ).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc.com/image/1.png</p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of purge. Valid values:</p>
     * <ul>
     * <li><strong>File</strong> (default): file purge.</li>
     * <li><strong>Directory</strong>: directory purge.</li>
     * <li><strong>Regex</strong>: regular expression-based purge.</li>
     * <li><strong>IgnoreParams</strong>: parameter-stripped purge. Parameter stripping refers to removing the question mark (?) and all characters after it from the request URL. Parameter-stripped purge means that you submit a parameter-stripped URL through the API, and the submitted URL is matched against cached resource URLs after parameter stripping. If a cached resource URL matches the submitted URL after parameter stripping, the CDN node purges the cached resource.</li>
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

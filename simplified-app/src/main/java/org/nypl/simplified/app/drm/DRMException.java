package org.nypl.simplified.app.drm;

/**
 * The root type of DRM-related exceptions.
 */

abstract class DRMException extends Exception
{
  private static final long serialVersionUID = 1L;

  DRMException(
    final String message,
    final Throwable e)
  {
    super(message, e);
  }

  DRMException(
    final String message)
  {
    super(message);
  }

  DRMException(
    final Throwable e)
  {
    super(e);
  }
}
